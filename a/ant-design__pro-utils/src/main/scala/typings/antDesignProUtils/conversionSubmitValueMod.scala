package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionSubmitValueMod {
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", JSImport.Default)
  @js.native
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = js.native
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", JSImport.Default)
  @js.native
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = js.native
  
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", "isPlainObject")
  @js.native
  def isPlainObject(o: Constructor): Boolean = js.native
  
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
