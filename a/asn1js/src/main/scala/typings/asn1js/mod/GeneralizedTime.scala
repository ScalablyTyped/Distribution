package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod._AsnSchemaType because Already inherited
- typings.asn1js.mod._AsnType because Already inherited */ @JSImport("asn1js", "GeneralizedTime")
@js.native
open class GeneralizedTime () extends UTCTime {
  def this(parameters: GeneralizedTimeParams) = this()
  
  var millisecond: Double = js.native
}
object GeneralizedTime {
  
  @JSImport("asn1js", "GeneralizedTime")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "GeneralizedTime.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
