package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.script.XScriptListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a provider for dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
@js.native
trait DialogProvider extends XDialogProvider {
  
  def createWithModel(Model: XModel): Unit = js.native
  
  def createWithModelAndScripting(Model: XModel, InStream: XInputStream, DialogLib: XNameContainer, ScriptListener: XScriptListener): Unit = js.native
}
object DialogProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDialog: String => XDialog,
    createWithModel: XModel => Unit,
    createWithModelAndScripting: (XModel, XInputStream, XNameContainer, XScriptListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DialogProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDialog = js.Any.fromFunction1(createDialog), createWithModel = js.Any.fromFunction1(createWithModel), createWithModelAndScripting = js.Any.fromFunction4(createWithModelAndScripting), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DialogProvider]
  }
  
  @scala.inline
  implicit class DialogProviderMutableBuilder[Self <: DialogProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithModel(value: XModel => Unit): Self = StObject.set(x, "createWithModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithModelAndScripting(value: (XModel, XInputStream, XNameContainer, XScriptListener) => Unit): Self = StObject.set(x, "createWithModelAndScripting", js.Any.fromFunction4(value))
  }
}
