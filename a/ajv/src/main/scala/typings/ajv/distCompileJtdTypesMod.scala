package typings.ajv

import typings.ajv.ajvStrings.`enum`
import typings.ajv.ajvStrings.`type`
import typings.ajv.ajvStrings.discriminator
import typings.ajv.ajvStrings.elements
import typings.ajv.ajvStrings.optionalProperties
import typings.ajv.ajvStrings.properties
import typings.ajv.ajvStrings.ref
import typings.ajv.ajvStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileJtdTypesMod {
  
  @JSImport("ajv/dist/compile/jtd/types", "jtdForms")
  @js.native
  val jtdForms: js.Tuple8[elements, values, discriminator, properties, optionalProperties, `enum`, `type`, ref] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.elements
    - typings.ajv.ajvStrings.values
    - typings.ajv.ajvStrings.discriminator
    - typings.ajv.ajvStrings.properties
    - typings.ajv.ajvStrings.optionalProperties
    - typings.ajv.ajvStrings.`enum`
    - typings.ajv.ajvStrings.`type`
    - typings.ajv.ajvStrings.ref
  */
  trait JTDForm extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Ref in string ]:? ajv.ajv/dist/types.SchemaObject}
    }}}
    */
  @js.native
  trait SchemaObjectMap extends StObject
}
