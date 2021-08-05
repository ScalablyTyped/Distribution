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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-utils", "FieldLabel")
  @js.native
  val FieldLabel: FC[FieldLabelProps] = js.native
  
  @JSImport("@ant-design/pro-utils", "FilterDropdown")
  @js.native
  val FilterDropdown: FC[DropdownProps] = js.native
  
  /**
    * 在 form 的 label 后面增加一个 tips 来展示一些说明文案
    * @param props
    */
  @JSImport("@ant-design/pro-utils", "LabelIconTip")
  @js.native
  val LabelIconTip: FC[Label] = js.native
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  inline def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionSubmitValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isDropdownValueType(valueType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDropdownValueType")(valueType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImg(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImg")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUrl(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def omitUndefined[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("omitUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def omitUndefinedAndEmptyArr[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("omitUndefinedAndEmptyArr")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def parseValueToMoment(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToMoment")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Moment | js.Array[Moment] | Null]]
  inline def parseValueToMoment(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValueToMoment")(value.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Moment | js.Array[Moment] | Null]]
  
  inline def pickProFormItemProps(props: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pickProFormItemProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def pickProProps(props: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pickProProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def transformKeySubmitValue[T](values: T, dataFormatMap: StringDictionary[js.UndefOr[SearchTransformKeyFn]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeySubmitValue")(values.asInstanceOf[js.Any], dataFormatMap.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useDebounceFn[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  inline def useDebounceFn[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: Double, wait: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  inline def useDebounceFn[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: DependencyList): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  inline def useDebounceFn[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: DependencyList, wait: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  
  inline def useDeepCompareEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeepCompareEffect")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDocumentTitle(titleInfo: Id, appDefaultTitle: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentTitle")(titleInfo.asInstanceOf[js.Any], appDefaultTitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDocumentTitle_false(titleInfo: Id, appDefaultTitle: `false`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentTitle")(titleInfo.asInstanceOf[js.Any], appDefaultTitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usePrevious[T](state: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
