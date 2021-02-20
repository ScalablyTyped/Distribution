package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLValidationErrors extends StObject {
  
  def apply(Index: Double): CustomXMLValidationError = js.native
  
  /**
    * @param ErrorText [ErrorText='']
    * @param ClearedOnUpdate [ClearedOnUpdate=true]
    */
  def Add(Node: CustomXMLNode, ErrorName: String): Unit = js.native
  def Add(
    Node: CustomXMLNode,
    ErrorName: String,
    ErrorText: js.UndefOr[scala.Nothing],
    ClearedOnUpdate: Boolean
  ): Unit = js.native
  def Add(Node: CustomXMLNode, ErrorName: String, ErrorText: String): Unit = js.native
  def Add(Node: CustomXMLNode, ErrorName: String, ErrorText: String, ClearedOnUpdate: Boolean): Unit = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): CustomXMLValidationError = js.native
  
  val Parent: js.Any = js.native
}
