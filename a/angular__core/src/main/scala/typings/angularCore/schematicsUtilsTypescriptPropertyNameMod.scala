package typings.angularCore

import typings.typescript.mod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptPropertyNameMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropertyNameText(node: PropertyName): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameText")(node.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def hasPropertyNameText(node: PropertyName): /* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPropertyNameText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean]
  
  object PropertyNameWithText {
    
    inline def escapedText: "escapedText" = "escapedText".asInstanceOf["escapedText"]
    
    inline def isInJSDocNamespace: "isInJSDocNamespace" = "isInJSDocNamespace".asInstanceOf["isInJSDocNamespace"]
    
    inline def originalKeywordKind: "originalKeywordKind" = "originalKeywordKind".asInstanceOf["originalKeywordKind"]
    
    inline def text: "text" = "text".asInstanceOf["text"]
  }
  /** Type that describes a property name with an obtainable text. */
  /* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
  type PropertyNameWithText = "escapedText" | "text" | "originalKeywordKind" | "isInJSDocNamespace"
}
