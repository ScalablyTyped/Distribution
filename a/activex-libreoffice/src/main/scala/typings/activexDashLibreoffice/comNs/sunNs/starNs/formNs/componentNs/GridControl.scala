package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormComponents
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XGridColumnFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XReset
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a model for a control which can display form data in a table-like way.
  *
  * In opposite to other form controls, grid controls do not only display the single current value of a column they are bound to. Moreover, they do
  * display not only the current row of the form, but all rows (at least potentially, limited by the control size, of course).
  *
  * The table rows in a grid control correspond to the rows in the {@link DataForm} the control belongs to, and the columns correspond to single columns
  * of the form's row set.
  *
  * Columns of a grid control are modeled by own objects, too. They are very similar to usual com::sun::star::form::DataAwareControlModels modeling other
  * "single-value" controls, but they are not described as own services. Instead, they need to be created using the {@link
  * com.sun.star.form.XGridColumnFactory} interface.
  */
@js.native
trait GridControl
  extends FormControlModel
     with FormComponents
     with XGridColumnFactory
     with XSelectionSupplier
     with XReset {
  /**
    * returns the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** contains the font attributes of the text in the control. */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /**
    * specifies the height of a row of the grid.
    *
    * If the value is set to `NULL` , the height is determined automatically according to the current font used.
    * @see GridControl.FontDescriptor
    */
  var RowHeight: Double = js.native
  /** determines whether the control can be reached by the tabulator key. */
  var Tabstop: Boolean = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
}

