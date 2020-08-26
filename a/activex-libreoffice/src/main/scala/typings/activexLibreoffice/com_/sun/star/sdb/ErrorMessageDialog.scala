package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a dialog for displaying database related exceptions.
  *
  * If applications use any of the functionality provided in the modules {@link com.sun.star.sdbc} , {@link com.sun.star.sdbcx} and {@link
  * com.sun.star.sdb} , they will - sooner or later - encounter {@link com.sun.star.sdbc.SQLException} 's. ;  These exceptions can be chained, so the
  * information wrapped in one single {@link com.sun.star.sdbc.SQLException} can be rather complex (e.g., every instance where such an exception is
  * passing before it is finally caught, could append a {@link com.sun.star.sdb.SQLContext} to explain what it was doing), and they should be presented to
  * the user in a consistent way. ;  This can be reached by using this service.
  * @see com.sun.star.sdb.InteractionHandler
  */
@js.native
trait ErrorMessageDialog extends XExecutableDialog {
  /**
    * allows initializing the dialog
    *
    * You do not need to call the initialize method directly, instead you may use the createInstanceWithArguments method of your {@link
    * com.sun.star.lang.XMultiServiceFactory} .
    *
    * You specify a parameter by passing one (or more) {@link com.sun.star.beans.PropertyValue} object(s) to the initialize method, where the **Name** field
    * contains a string describing which aspect you want to affect, and the **Value** field containing a value. ;  Imagine the initialization values, as if
    * you use {@link com.sun.star.beans} ">XPropertySet::setPropertyValue() of the {@link com.sun.star.beans.XPropertySet} interface ... ;  allowed
    * parameters are **title**;  String describing the initial title of the dialog. If not specified, a default title is used.**parentWindow**; {@link
    * com.sun.star.awt.XWindow} describing the parent window to use for the dialog.**sqlException**; {@link com.sun.star.sdbc.SQLException} describing the
    * error which is being displayed. ;  When initializing this value, you may use any derivative of {@link com.sun.star.sdbc.SQLException} .
    */
  def create(initialTitle: String, parentWindow: XWindow, sqlException: js.Any): Unit = js.native
}

object ErrorMessageDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: (String, XWindow, js.Any) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): ErrorMessageDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ErrorMessageDialog]
  }
  @scala.inline
  implicit class ErrorMessageDialogOps[Self <: ErrorMessageDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: (String, XWindow, js.Any) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
  }
  
}

