package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.IAny because Already inherited
- typings.asn1js.mod._AsnSchemaType because Already inherited
- typings.asn1js.mod.IChoice because var conflicts: name, optional. Inlined value */ @JSImport("asn1js", "Choice")
@js.native
open class Choice () extends Any {
  def this(param0: ChoiceParams) = this()
  
  var value: js.Array[BaseBlock[ValueBlock, ValueBlockJson]] = js.native
}
