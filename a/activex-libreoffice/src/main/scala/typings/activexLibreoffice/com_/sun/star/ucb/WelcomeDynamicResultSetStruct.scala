package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct is to be contained in the first notification of an {@link XDynamicResultSet} .
  * @see XDynamicResultSet
  * @see ListEvent
  * @see ListAction
  * @see ListActionType
  */
@js.native
trait WelcomeDynamicResultSetStruct extends js.Object {
  
  /** The static result set containing the new version of result set data. */
  var New: XResultSet = js.native
  
  /** The static result set containing the previous version of result set data. */
  var Old: XResultSet = js.native
}
object WelcomeDynamicResultSetStruct {
  
  @scala.inline
  def apply(New: XResultSet, Old: XResultSet): WelcomeDynamicResultSetStruct = {
    val __obj = js.Dynamic.literal(New = New.asInstanceOf[js.Any], Old = Old.asInstanceOf[js.Any])
    __obj.asInstanceOf[WelcomeDynamicResultSetStruct]
  }
  
  @scala.inline
  implicit class WelcomeDynamicResultSetStructOps[Self <: WelcomeDynamicResultSetStruct] (val x: Self) extends AnyVal {
    
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
    def setNew(value: XResultSet): Self = this.set("New", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: XResultSet): Self = this.set("Old", value.asInstanceOf[js.Any])
  }
}
