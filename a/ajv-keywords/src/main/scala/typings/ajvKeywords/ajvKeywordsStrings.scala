package typings.ajvKeywords

import typings.ajvKeywords.definitionsRangeMod.RangeKwd
import typings.ajvKeywords.requiredMod.RequiredKwd
import typings.ajvKeywords.transformMod.TransformName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajvKeywordsStrings {
  
  @js.native
  sealed trait allRequired extends StObject
  inline def allRequired: allRequired = "allRequired".asInstanceOf[allRequired]
  
  @js.native
  sealed trait anyRequired
    extends StObject
       with RequiredKwd
  inline def anyRequired: anyRequired = "anyRequired".asInstanceOf[anyRequired]
  
  @js.native
  sealed trait deepProperties extends StObject
  inline def deepProperties: deepProperties = "deepProperties".asInstanceOf[deepProperties]
  
  @js.native
  sealed trait deepRequired extends StObject
  inline def deepRequired: deepRequired = "deepRequired".asInstanceOf[deepRequired]
  
  @js.native
  sealed trait dynamicDefaults extends StObject
  inline def dynamicDefaults: dynamicDefaults = "dynamicDefaults".asInstanceOf[dynamicDefaults]
  
  @js.native
  sealed trait exclusiveRange
    extends StObject
       with RangeKwd
  inline def exclusiveRange: exclusiveRange = "exclusiveRange".asInstanceOf[exclusiveRange]
  
  @js.native
  sealed trait instanceof extends StObject
  inline def instanceof: instanceof = "instanceof".asInstanceOf[instanceof]
  
  @js.native
  sealed trait oneRequired
    extends StObject
       with RequiredKwd
  inline def oneRequired: oneRequired = "oneRequired".asInstanceOf[oneRequired]
  
  @js.native
  sealed trait patternRequired extends StObject
  inline def patternRequired: patternRequired = "patternRequired".asInstanceOf[patternRequired]
  
  @js.native
  sealed trait prohibited extends StObject
  inline def prohibited: prohibited = "prohibited".asInstanceOf[prohibited]
  
  @js.native
  sealed trait range
    extends StObject
       with RangeKwd
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait regexp extends StObject
  inline def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait toEnumCase
    extends StObject
       with TransformName
  inline def toEnumCase: toEnumCase = "toEnumCase".asInstanceOf[toEnumCase]
  
  @js.native
  sealed trait toLowerCase
    extends StObject
       with TransformName
  inline def toLowerCase: toLowerCase = "toLowerCase".asInstanceOf[toLowerCase]
  
  @js.native
  sealed trait toUpperCase
    extends StObject
       with TransformName
  inline def toUpperCase: toUpperCase = "toUpperCase".asInstanceOf[toUpperCase]
  
  @js.native
  sealed trait transform extends StObject
  inline def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait trim
    extends StObject
       with TransformName
  inline def trim: trim = "trim".asInstanceOf[trim]
  
  @js.native
  sealed trait trimEnd
    extends StObject
       with TransformName
  inline def trimEnd: trimEnd = "trimEnd".asInstanceOf[trimEnd]
  
  @js.native
  sealed trait trimLeft
    extends StObject
       with TransformName
  inline def trimLeft: trimLeft = "trimLeft".asInstanceOf[trimLeft]
  
  @js.native
  sealed trait trimRight
    extends StObject
       with TransformName
  inline def trimRight: trimRight = "trimRight".asInstanceOf[trimRight]
  
  @js.native
  sealed trait trimStart
    extends StObject
       with TransformName
  inline def trimStart: trimStart = "trimStart".asInstanceOf[trimStart]
  
  @js.native
  sealed trait uniqueItemProperties extends StObject
  inline def uniqueItemProperties: uniqueItemProperties = "uniqueItemProperties".asInstanceOf[uniqueItemProperties]
}
