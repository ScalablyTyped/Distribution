package typings.angularCore

import typings.typescript.mod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyNameMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", "getPropertyNameText")
  @js.native
  def getPropertyNameText(node: PropertyName): String | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", "hasPropertyNameText")
  @js.native
  def hasPropertyNameText(node: PropertyName): /* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean = js.native
  
  /** Type that describes a property name with an obtainable text. */
  /* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
  /* Rewritten from type alias, can be one of: 
    - typings.angularCore.angularCoreStrings.escapedText
    - typings.angularCore.angularCoreStrings.text
    - typings.angularCore.angularCoreStrings.originalKeywordKind
    - typings.angularCore.angularCoreStrings.isInJSDocNamespace
  */
  trait PropertyNameWithText extends StObject
  object PropertyNameWithText {
    
    @scala.inline
    def escapedText: typings.angularCore.angularCoreStrings.escapedText = "escapedText".asInstanceOf[typings.angularCore.angularCoreStrings.escapedText]
    
    @scala.inline
    def isInJSDocNamespace: typings.angularCore.angularCoreStrings.isInJSDocNamespace = "isInJSDocNamespace".asInstanceOf[typings.angularCore.angularCoreStrings.isInJSDocNamespace]
    
    @scala.inline
    def originalKeywordKind: typings.angularCore.angularCoreStrings.originalKeywordKind = "originalKeywordKind".asInstanceOf[typings.angularCore.angularCoreStrings.originalKeywordKind]
    
    @scala.inline
    def text: typings.angularCore.angularCoreStrings.text = "text".asInstanceOf[typings.angularCore.angularCoreStrings.text]
  }
}
