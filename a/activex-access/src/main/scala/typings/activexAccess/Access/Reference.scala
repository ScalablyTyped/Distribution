package typings.activexAccess.Access

import typings.activexVbide.VBIDE.vbextRefKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends StObject {
  
  @JSName("Access.Reference_typekey")
  var AccessDotReference_typekey: Reference = js.native
  
  val BuiltIn: Boolean = js.native
  
  def Collection(var_0: String): Reference = js.native
  def Collection(var_0: Double): Reference = js.native
  @JSName("Collection")
  val Collection_Original: References = js.native
  
  val FullPath: String = js.native
  
  val Guid: String = js.native
  
  val IsBroken: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Kind: vbextRefKind = js.native
  
  val Major: Double = js.native
  
  val Minor: Double = js.native
  
  val Name: String = js.native
}
