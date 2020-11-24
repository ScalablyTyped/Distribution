package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  
  @js.native
  class default[T] () extends js.Object {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    def get(key: String, `def`: T): js.UndefOr[T] = js.native
    
    def has(key: String): Boolean = js.native
    
    var map: StringDictionary[T] = js.native
    
    def set(key: String, value: T): Unit = js.native
    
    def size(): Double = js.native
  }
}
