package typings.aliApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object my {
  
  type Color = java.lang.String | js.Array[scala.Double] | scala.Double | typings.aliApp.my.CanvasAction
  
  type RemoveSavedFileOptions = typings.aliApp.my.GetSavedFileInfoOptions
  
  //#region 网络 https://docs.alipay.com/mini/api/network
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  /* Rewritten from type alias, can be one of: 
    - typings.aliApp.aliAppStrings.keyword
    - typings.aliApp.aliAppStrings.`0`
    - typings.aliApp.aliAppStrings.`1`
    - typings.aliApp.aliAppStrings.`2`
    - typings.aliApp.aliAppStrings.`3`
    - java.lang.String
  */
  type TextRiskIdentificationType = typings.aliApp.my._TextRiskIdentificationType | java.lang.String
  
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
}
