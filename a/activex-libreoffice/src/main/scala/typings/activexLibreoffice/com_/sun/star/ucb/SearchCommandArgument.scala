package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the command "search".
  * @see XCommandProcessor
  */
@js.native
trait SearchCommandArgument extends StObject {
  
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
  implicit class SearchCommandArgumentMutableBuilder[Self <: SearchCommandArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: SearchInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: SafeArray[Property]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
