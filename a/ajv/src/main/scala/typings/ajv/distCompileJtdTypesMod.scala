package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileJtdTypesMod {
  
  @JSImport("ajv/dist/compile/jtd/types", "jtdForms")
  @js.native
  val jtdForms: js.Tuple8[
    "elements", 
    "values", 
    "discriminator", 
    "properties", 
    "optionalProperties", 
    "enum", 
    "type", 
    "ref"
  ] = js.native
  
  type JTDForm = "elements" | "values" | "discriminator" | "properties" | "optionalProperties" | "enum" | "type" | "ref"
  
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
