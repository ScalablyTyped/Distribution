package typings.abbrev

import org.scalablytyped.runtime.StringDictionary
import typings.abbrev.mod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abbrev", JSImport.Namespace)
  @js.native
  def apply(words: String*): StringDictionary[String] = js.native
  @JSImport("abbrev", JSImport.Namespace)
  @js.native
  def apply(words: Array[String]): StringDictionary[String] = js.native
  
  @JSImport("abbrev", "monkeyPatch")
  @js.native
  def monkeyPatch(): Unit = js.native
  
  object global {
    
    @js.native
    trait Array[T] extends StObject {
      
      def abbrev(): StringDictionary[String] = js.native
    }
    object Array {
      
      @scala.inline
      def apply[T](abbrev: () => StringDictionary[String]): Array[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[Array[T]]
      }
      
      @scala.inline
      implicit class ArrayMutableBuilder[Self <: Array[_], T] (val x: Self with Array[T]) extends AnyVal {
        
        @scala.inline
        def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Object extends StObject {
      
      def abbrev(): StringDictionary[String] = js.native
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
    
    @js.native
    trait ReadonlyArray[T] extends StObject {
      
      def abbrev(): StringDictionary[String] = js.native
    }
    object ReadonlyArray {
      
      @scala.inline
      def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
        val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
        __obj.asInstanceOf[ReadonlyArray[T]]
      }
      
      @scala.inline
      implicit class ReadonlyArrayMutableBuilder[Self <: ReadonlyArray[_], T] (val x: Self with ReadonlyArray[T]) extends AnyVal {
        
        @scala.inline
        def setAbbrev(value: () => StringDictionary[String]): Self = StObject.set(x, "abbrev", js.Any.fromFunction0(value))
      }
    }
  }
}
