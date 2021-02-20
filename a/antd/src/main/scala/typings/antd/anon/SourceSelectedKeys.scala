package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSelectedKeys extends StObject {
  
  var sourceSelectedKeys: js.Array[String] = js.native
  
  var targetSelectedKeys: js.Array[String] = js.native
}
object SourceSelectedKeys {
  
  @scala.inline
  def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): SourceSelectedKeys = {
    val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSelectedKeys]
  }
  
  @scala.inline
  implicit class SourceSelectedKeysMutableBuilder[Self <: SourceSelectedKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "sourceSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelectedKeysVarargs(value: String*): Self = StObject.set(x, "sourceSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setTargetSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "targetSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectedKeysVarargs(value: String*): Self = StObject.set(x, "targetSelectedKeys", js.Array(value :_*))
  }
}
