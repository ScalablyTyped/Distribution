package typings.abbrev

import org.scalablytyped.runtime.StringDictionary
import typings.abbrev.anon.ToString
import typings.abbrev.mod.global.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(words: Abbreviable*): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].apply(words.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StringDictionary[String]]
  inline def apply(words: ReadonlyArray[Abbreviable]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].apply(words.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  @JSImport("abbrev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def monkeyPatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatch")().asInstanceOf[Unit]
  
  type Abbreviable = String | ToString
  
  object global {
    
    trait Array[T] extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object Array {
      
      inline def apply[T](abbrev: () => StringDictionary[String]): Array[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[Array[T]]
      }
      
      extension [Self <: Array[?], T](x: Self & Array[T]) {
        
        inline def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
    
    trait Object extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object Object {
      
      inline def apply(abbrev: () => StringDictionary[String]): Object = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[Object]
      }
      
      extension [Self <: Object](x: Self) {
        
        inline def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
    
    trait ReadonlyArray[T] extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object ReadonlyArray {
      
      inline def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[ReadonlyArray[T]]
      }
      
      extension [Self <: ReadonlyArray[?], T](x: Self & ReadonlyArray[T]) {
        
        inline def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
  }
}
