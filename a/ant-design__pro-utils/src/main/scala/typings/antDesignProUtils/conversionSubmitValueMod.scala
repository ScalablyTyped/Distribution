package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionSubmitValueMod {
  
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  @scala.inline
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def isPlainObject(o: Constructor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
    - typings.antDesignProUtils.antDesignProUtilsStrings.number
    - typings.antDesignProUtils.antDesignProUtilsStrings.string
  */
  trait DateFormatter extends StObject
  object DateFormatter {
    
    @scala.inline
    def `false`: typings.antDesignProUtils.antDesignProUtilsBooleans.`false` = false.asInstanceOf[typings.antDesignProUtils.antDesignProUtilsBooleans.`false`]
    
    @scala.inline
    def number: typings.antDesignProUtils.antDesignProUtilsStrings.number = "number".asInstanceOf[typings.antDesignProUtils.antDesignProUtilsStrings.number]
    
    @scala.inline
    def string: typings.antDesignProUtils.antDesignProUtilsStrings.string = "string".asInstanceOf[typings.antDesignProUtils.antDesignProUtilsStrings.string]
  }
}
