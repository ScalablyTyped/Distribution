package typings.abbrev

import org.scalablytyped.runtime.StringDictionary
import typings.abbrev.mod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(words: String*): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].apply(words.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  @scala.inline
  def apply(words: Array[String]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].apply(words.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  @JSImport("abbrev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def monkeyPatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatch")().asInstanceOf[Unit]
  
  object global {
    
    trait Array[T] extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object Array {
      
      @scala.inline
      def apply[T](abbrev: () => StringDictionary[String]): Array[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[Array[T]]
      }
      
      @scala.inline
      implicit class ArrayMutableBuilder[Self <: Array[?], T] (val x: Self & Array[T]) extends AnyVal {
        
        @scala.inline
        def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
    
    trait Object extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object Object {
      
      @scala.inline
      def apply(abbrev: () => StringDictionary[String]): Object = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[Object]
      }
      
      @scala.inline
      implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
    
    trait ReadonlyArray[T] extends StObject {
      
      def abbrev(): StringDictionary[String]
    }
    object ReadonlyArray {
      
      @scala.inline
      def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[ReadonlyArray[T]]
      }
      
      @scala.inline
      implicit class ReadonlyArrayMutableBuilder[Self <: ReadonlyArray[?], T] (val x: Self & ReadonlyArray[T]) extends AnyVal {
        
        @scala.inline
        def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
  }
}
