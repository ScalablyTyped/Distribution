package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends StObject {
  
  @JSName("DAO.Parameter_typekey")
  var DAODotParameter_typekey: Parameter = js.native
  
  var Direction: Double = js.native
  
  val Name: String = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Type: Double = js.native
  
  var Value: js.Any = js.native
}
