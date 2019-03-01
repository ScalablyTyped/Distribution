package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates operations on a database form which has a UI representation, and is interacting with the user.
  * @since OOo 2.2
  */
trait FormOperations extends XFormOperations {
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.component.DataForm} instance.
    * @throws IllegalArgumentException if the given form is `NULL` , or does not support the {@link com.sun.star.form.component.DataForm} service.
    */
  def createWithForm(Form: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm): scala.Unit
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
    * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
    */
  def createWithFormController(Controller: XFormController): scala.Unit
}

object FormOperations {
  @scala.inline
  def apply(
    Controller: XFormController,
    Cursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    FeatureInvalidation: XFeatureInvalidation,
    UpdateCursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetUpdate,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commitCurrentControl: js.Function0[scala.Boolean],
    commitCurrentRecord: js.Function1[js.Array[scala.Boolean], scala.Boolean],
    createWithForm: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm, scala.Unit],
    createWithFormController: js.Function1[XFormController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function1[scala.Double, scala.Unit],
    executeWithArguments: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    getState: js.Function1[scala.Double, FeatureState],
    isEnabled: js.Function1[scala.Double, scala.Boolean],
    isInsertionRow: js.Function0[scala.Boolean],
    isModifiedRow: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): FormOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Cursor")(Cursor)
    __obj.updateDynamic("FeatureInvalidation")(FeatureInvalidation)
    __obj.updateDynamic("UpdateCursor")(UpdateCursor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("commitCurrentControl")(commitCurrentControl)
    __obj.updateDynamic("commitCurrentRecord")(commitCurrentRecord)
    __obj.updateDynamic("createWithForm")(createWithForm)
    __obj.updateDynamic("createWithFormController")(createWithFormController)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("executeWithArguments")(executeWithArguments)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isInsertionRow")(isInsertionRow)
    __obj.updateDynamic("isModifiedRow")(isModifiedRow)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[FormOperations]
  }
}

