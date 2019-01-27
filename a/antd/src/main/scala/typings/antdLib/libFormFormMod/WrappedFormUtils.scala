package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFormUtils extends js.Object {
  def getFieldDecorator[T /* <: js.Object */](id: java.lang.String): js.Function1[
    /* node */ reactLib.reactMod.ReactNs.ReactNode, 
    reactLib.reactMod.ReactNs.ReactNode
  ] = js.native
  def getFieldDecorator[T /* <: js.Object */](id: java.lang.String, options: GetFieldDecoratorOptions): js.Function1[
    /* node */ reactLib.reactMod.ReactNs.ReactNode, 
    reactLib.reactMod.ReactNs.ReactNode
  ] = js.native
  /** 获取某个输入控件的 Error */
  def getFieldError(name: java.lang.String): js.Array[js.Object] = js.native
  /** 获取一个输入控件的值*/
  def getFieldValue(fieldName: java.lang.String): js.Any = js.native
  def getFieldsError(): js.Object = js.native
  def getFieldsError(names: js.Array[java.lang.String]): js.Object = js.native
  /** 获取一组输入控件的值，如不传入参数，则获取全部组件的值 */
  def getFieldsValue(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getFieldsValue(fieldNames: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def isFieldTouched(name: java.lang.String): scala.Boolean = js.native
  /** 判断一个输入控件是否在校验状态*/
  def isFieldValidating(name: java.lang.String): scala.Boolean = js.native
  def isFieldsTouched(): scala.Boolean = js.native
  def isFieldsTouched(names: js.Array[java.lang.String]): scala.Boolean = js.native
  /** 重置一组输入控件的值与状态，如不传入参数，则重置所有组件 */
  def resetFields(): scala.Unit = js.native
  def resetFields(names: js.Array[java.lang.String]): scala.Unit = js.native
  /** 设置一组输入控件的值*/
  def setFields(obj: js.Object): scala.Unit = js.native
  /** 设置一组输入控件的值*/
  def setFieldsValue(obj: js.Object): scala.Unit = js.native
  def validateFields(): scala.Unit = js.native
  def validateFields(callback: ValidateCallback): scala.Unit = js.native
  def validateFields(fieldNames: js.Array[java.lang.String]): scala.Unit = js.native
  def validateFields(fieldNames: js.Array[java.lang.String], callback: ValidateCallback): scala.Unit = js.native
  def validateFields(fieldNames: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  /** 校验并获取一组输入域的值与 Error */
  def validateFields(fieldNames: js.Array[java.lang.String], options: js.Object, callback: ValidateCallback): scala.Unit = js.native
  def validateFields(options: js.Object): scala.Unit = js.native
  def validateFields(options: js.Object, callback: ValidateCallback): scala.Unit = js.native
  def validateFieldsAndScroll(): scala.Unit = js.native
  def validateFieldsAndScroll(callback: ValidateCallback): scala.Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[java.lang.String]): scala.Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[java.lang.String], callback: ValidateCallback): scala.Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  /** 与 `validateFields` 相似，但校验完后，如果校验不通过的菜单域不在可见范围内，则自动滚动进可见范围 */
  def validateFieldsAndScroll(fieldNames: js.Array[java.lang.String], options: js.Object, callback: ValidateCallback): scala.Unit = js.native
  def validateFieldsAndScroll(options: js.Object): scala.Unit = js.native
  def validateFieldsAndScroll(options: js.Object, callback: ValidateCallback): scala.Unit = js.native
}

