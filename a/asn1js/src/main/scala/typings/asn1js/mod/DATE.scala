package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod._AsnSchemaType because Already inherited
- typings.asn1js.mod._AsnType because Already inherited */ @JSImport("asn1js", "DATE")
@js.native
open class DATE () extends Utf8String {
  def this(parameters: DATEParams) = this()
}
object DATE {
  
  @JSImport("asn1js", "DATE")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "DATE.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
