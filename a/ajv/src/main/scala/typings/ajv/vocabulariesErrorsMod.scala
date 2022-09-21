package typings.ajv

import typings.ajv.applicatorMod.ApplicatorKeywordError
import typings.ajv.dataTypeMod.TypeError
import typings.ajv.dependentRequiredMod.DependentRequiredError
import typings.ajv.discriminatorMod.DiscriminatorError
import typings.ajv.formatFormatMod.FormatError
import typings.ajv.unevaluatedItemsMod.UnevaluatedItemsError
import typings.ajv.unevaluatedPropertiesMod.UnevaluatedPropertiesError
import typings.ajv.validationMod.ValidationKeywordError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vocabulariesErrorsMod {
  
  type DefinedError = TypeError | ApplicatorKeywordError | ValidationKeywordError | FormatError | UnevaluatedPropertiesError | UnevaluatedItemsError | DependentRequiredError | DiscriminatorError
}
