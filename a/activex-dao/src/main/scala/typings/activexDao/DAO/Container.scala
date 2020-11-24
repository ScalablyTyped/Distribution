package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  val AllPermissions: Double = js.native
  
  @JSName("DAO.Container_typekey")
  var DAODotContainer_typekey: Container = js.native
  
  def Documents(Item: String): Document = js.native
  def Documents(Item: Double): Document = js.native
  @JSName("Documents")
  val Documents_Original: Documents = js.native
  
  var Inherit: Boolean = js.native
  
  val Name: String = js.native
  
  var Owner: String = js.native
  
  var Permissions: Double = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var UserName: String = js.native
}
