package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "insert".
  * @see XCommandProcessor
  */
@js.native
trait InsertCommandArgument extends js.Object {
  
  /**
    * A stream containing document data.
    *
    * This member can be left blank, if no (new) document data shall be written by the implementation of the "insert" command.
    */
  var Data: XInputStream = js.native
  
  /**
    * A flag indicating whether a possibly existing content (and its data) shall be overwritten.
    *
    * Implementations that are not able to detect whether there are previous data may ignore this parameter and will always write the new data.
    */
  var ReplaceExisting: Boolean = js.native
}
object InsertCommandArgument {
  
  @scala.inline
  def apply(Data: XInputStream, ReplaceExisting: Boolean): InsertCommandArgument = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], ReplaceExisting = ReplaceExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCommandArgument]
  }
  
  @scala.inline
  implicit class InsertCommandArgumentOps[Self <: InsertCommandArgument] (val x: Self) extends AnyVal {
    
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
    def setData(value: XInputStream): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceExisting(value: Boolean): Self = this.set("ReplaceExisting", value.asInstanceOf[js.Any])
  }
}
