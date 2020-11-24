package typings.antDesignProUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typingMod {
  
  type ProFieldRequestData[T, U] = js.Function2[
    /* params */ U, 
    /* props */ T, 
    js.Promise[js.Array[typings.antDesignProUtils.anon.Dictkey]]
  ]
  
  type ProSchema[T, U, Extra] = (typings.antDesignProUtils.anon.DataIndex[T, U]) with Extra
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProUtils.antDesignProUtilsStrings.form
    - typings.antDesignProUtils.antDesignProUtilsStrings.list
    - typings.antDesignProUtils.antDesignProUtilsStrings.descriptions
    - typings.antDesignProUtils.antDesignProUtilsStrings.table
    - typings.antDesignProUtils.antDesignProUtilsStrings.cardList
    - js.UndefOr[scala.Nothing]
  */
  type ProSchemaComponentTypes = js.UndefOr[typings.antDesignProUtils.typingMod._ProSchemaComponentTypes]
  
  type ProSchemaValueEnumMap = typings.std.Map[
    typings.react.mod.ReactText, 
    typings.antDesignProUtils.typingMod.ProSchemaValueEnumType | typings.react.mod.ReactNode
  ]
  
  type ProSchemaValueEnumObj = org.scalablytyped.runtime.StringDictionary[
    typings.antDesignProUtils.typingMod.ProSchemaValueEnumType | typings.react.mod.ReactNode
  ]
  
  type SearchTransformKeyFn = js.Function3[
    /* value */ js.Any, 
    /* field */ java.lang.String, 
    /* object */ js.Any, 
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  ]
}
