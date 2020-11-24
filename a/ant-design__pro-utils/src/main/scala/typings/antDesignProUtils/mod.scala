package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.anon.Id
import typings.antDesignProUtils.anon.Label
import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.antDesignProUtils.conversionSubmitValueMod.DateFormatter
import typings.antDesignProUtils.fieldLabelMod.FieldLabelProps
import typings.antDesignProUtils.filterDropdownMod.DropdownProps
import typings.antDesignProUtils.parseValueToMomentMod.DateValue
import typings.antDesignProUtils.typingMod.SearchTransformKeyFn
import typings.antDesignProUtils.useDebounceFnMod.ReturnValue
import typings.moment.mod.Moment
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/pro-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val FieldLabel: FC[FieldLabelProps] = js.native
  
  val FilterDropdown: FC[DropdownProps] = js.native
  
  /**
    * 在 form 的 label 后面增加一个 tips 来展示一些说明文案
    * @param props
    */
  val LabelIconTip: FC[Label] = js.native
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = js.native
  def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = js.native
  
  def isBrowser(): Boolean = js.native
  
  def isDropdownValueType(valueType: String): Boolean = js.native
  
  def isImg(path: String): Boolean = js.native
  
  def isNil(value: js.Any): Boolean = js.native
  
  def isUrl(path: String): Boolean = js.native
  
  def omitUndefined[T](obj: T): T = js.native
  
  def omitUndefinedAndEmptyArr[T](obj: T): T = js.native
  
  def parseValueToMoment(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  def parseValueToMoment(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  
  def pickProFormItemProps(props: js.Object): js.Object = js.native
  
  def pickProProps(props: js.Object): js.Object = js.native
  
  def transformKeySubmitValue[T](values: T, dataFormatMap: StringDictionary[js.UndefOr[SearchTransformKeyFn]]): T = js.native
  
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double): ReturnValue[T] = js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double, wait: Double): ReturnValue[T] = js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList): ReturnValue[T] = js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList, wait: Double): ReturnValue[T] = js.native
  
  def useDeepCompareEffect(effect: EffectCallback): Unit = js.native
  def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList): Unit = js.native
  
  def useDocumentTitle(titleInfo: Id, appDefaultTitle: String): Unit = js.native
  @JSName("useDocumentTitle")
  def useDocumentTitle_false(titleInfo: Id, appDefaultTitle: `false`): Unit = js.native
  
  def usePrevious[T](state: T): js.UndefOr[T] = js.native
}
