package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "search".
  * @see XCommandProcessor
  */
@js.native
trait SearchCommandArgument extends js.Object {
  
  /** the search criteria. */
  var Info: SearchInfo = js.native
  
  /** the properties for which values shall be provided through the {@link ContentResultSet} returned by the search command. */
  var Properties: SafeArray[Property] = js.native
}
object SearchCommandArgument {
  
  @scala.inline
  def apply(Info: SearchInfo, Properties: SafeArray[Property]): SearchCommandArgument = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCommandArgument]
  }
  
  @scala.inline
  implicit class SearchCommandArgumentOps[Self <: SearchCommandArgument] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: SearchInfo): Self = this.set("Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: SafeArray[Property]): Self = this.set("Properties", value.asInstanceOf[js.Any])
  }
}
