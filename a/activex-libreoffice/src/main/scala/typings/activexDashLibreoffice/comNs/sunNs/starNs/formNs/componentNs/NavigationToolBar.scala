package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies the model for control which provides controller functionality for a {@link DataForm} , such as navigating or filtering the
  * form.
  */
@js.native
trait NavigationToolBar extends FormControlModel {
  /**
    * denotes the border style of the control.
    *
    * Allowed values are **0** : no border at all**1** : 3D border**2** : simple flat
    */
  var Border: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** contains the font attributes for the text in the control */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /**
    * specifies the emphasis mark for the font described in {@link FontDescriptor}
    *
    * The value must be one of the {@link com.sun.star.text.FontEmphasis} constants.
    */
  var FontEmphasisMark: Double = js.native
  /**
    * specifies the relief for the font described in {@link FontDescriptor}
    *
    * The value must be one of the {@link com.sun.star.text.FontRelief} constants.
    */
  var FontRelief: Double = js.native
  /**
    * specifies the size of the icons in the control
    *
    * At least the following values are to be supported: 0: small icons (16x16)1: medium size icons (26x26)
    */
  var IconSize: Double = js.native
  /**
    * specifies a repeat delay for the control
    *
    * Some buttons of a {@link NavigationToolBar} may show repeating behavior, e.g. may be repeatedly triggered when the user keeps the mouse pressed over
    * such a button. ;  The delay between two such triggers (in milliseconds) is specified with this property.
    */
  var RepeatDelay: Double = js.native
  /** determines whether the control should provide functionality for filtering and sorting the parent form */
  var ShowFilterSort: Boolean = js.native
  /** determines whether the control should provide functionality for navigating the parent form */
  var ShowNavigation: Boolean = js.native
  /** determines whether the control should provide functionality for positioning the parent form */
  var ShowPosition: Boolean = js.native
  /** determines whether the control should provide functionality for acting on the current record of the parent form */
  var ShowRecordActions: Boolean = js.native
  /** specifies the text color (as RGB value) of the control. */
  var TextColor: Double = js.native
  /**
    * specifies the text line color (as RGB value) of the control.
    *
    * This color is used if the {@link FontDescriptor} defines that the text in the control should be underlined or stroke out.
    */
  var TextLineColor: Double = js.native
}

