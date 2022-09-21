package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionObject extends StObject {
  
  def Add(bstrUserId: String): UserPermissionObject = js.native
  def Add(bstrUserId: String, varPermission: Any): UserPermissionObject = js.native
  def Add(bstrUserId: String, varPermission: Any, varExpirationDate: Any): UserPermissionObject = js.native
  def Add(bstrUserId: String, varPermission: Unit, varExpirationDate: Any): UserPermissionObject = js.native
  
  def ApplyPolicy(bstrFileName: String): Unit = js.native
  
  val Count: Double = js.native
  
  var DocumentAuthor: String = js.native
  
  var Enabled: Boolean = js.native
  
  /* private */ @JSName("InfoPath.PermissionObject_typekey")
  var InfoPathDotPermissionObject_typekey: PermissionObject = js.native
  
  def Item(varIndex: Any): UserPermissionObject = js.native
  
  val PermissionFromPolicy: Boolean = js.native
  
  val PolicyDescription: String = js.native
  
  val PolicyName: String = js.native
  
  def RemoveAll(): Unit = js.native
  
  var RequestPermissionURL: String = js.native
  
  var StoreLicenses: Boolean = js.native
}
