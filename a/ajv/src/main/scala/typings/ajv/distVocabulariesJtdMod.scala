package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.distVocabulariesJtdDiscriminatorMod.JTDDiscriminatorError
import typings.ajv.distVocabulariesJtdElementsMod.JTDElementsError
import typings.ajv.distVocabulariesJtdEnumMod.JTDEnumError
import typings.ajv.distVocabulariesJtdPropertiesMod.JTDPropertiesError
import typings.ajv.distVocabulariesJtdTypeMod.JTDTypeError
import typings.ajv.distVocabulariesJtdValuesMod.JTDValuesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type JTDErrorObject = JTDTypeError | JTDEnumError | JTDElementsError | JTDPropertiesError | JTDDiscriminatorError | JTDValuesError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdMod.foo` */
  override def _to: Vocabulary = default
}
