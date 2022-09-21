package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.elementsMod.JTDElementsError
import typings.ajv.enumMod.JTDEnumError
import typings.ajv.jtdDiscriminatorMod.JTDDiscriminatorError
import typings.ajv.jtdPropertiesMod.JTDPropertiesError
import typings.ajv.typeMod.JTDTypeError
import typings.ajv.valuesMod.JTDValuesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vocabulariesJtdMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type JTDErrorObject = JTDTypeError | JTDEnumError | JTDElementsError | JTDPropertiesError | JTDDiscriminatorError | JTDValuesError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `vocabulariesJtdMod.foo` */
  override def _to: Vocabulary = default
}
