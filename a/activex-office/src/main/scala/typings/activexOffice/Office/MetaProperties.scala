package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperties extends StObject {
  
  def apply(Index: String): MetaProperty = js.native
  def apply(Index: Double): MetaProperty = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def GetItemByInternalName(InternalName: String): MetaProperty = js.native
  
  def Item(Index: String): MetaProperty = js.native
  def Item(Index: Double): MetaProperty = js.native
  
  val Parent: js.Any = js.native
  
  val SchemaXml: String = js.native
  
  def Validate(): String = js.native
  
  val ValidationError: String = js.native
}
