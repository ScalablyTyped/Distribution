package typings.antd.formFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFormUtils[V] extends js.Object {
  def getFieldDecorator[T /* <: js.Object */](id: String): js.Function1[/* node */ ReactNode, ReactNode] = js.native
  def getFieldDecorator[T /* <: js.Object */](id: String, options: GetFieldDecoratorOptions): js.Function1[/* node */ ReactNode, ReactNode] = js.native
  /** 获取某个输入控件的 Error */
  def getFieldError(name: String): js.UndefOr[js.Array[String]] = js.native
  /** 获取一个输入控件的值 */
  def getFieldValue(fieldName: String): js.Any = js.native
  def getFieldsError(): Record[String, js.UndefOr[js.Array[String]]] = js.native
  def getFieldsError(names: js.Array[String]): Record[String, js.UndefOr[js.Array[String]]] = js.native
  /** 获取一组输入控件的值，如不传入参数，则获取全部组件的值 */
  def getFieldsValue(): StringDictionary[js.Any] = js.native
  def getFieldsValue(fieldNames: js.Array[String]): StringDictionary[js.Any] = js.native
  def isFieldTouched(name: String): Boolean = js.native
  /** 判断一个输入控件是否在校验状态 */
  def isFieldValidating(name: String): Boolean = js.native
  def isFieldsTouched(): Boolean = js.native
  def isFieldsTouched(names: js.Array[String]): Boolean = js.native
  /** 重置一组输入控件的值与状态，如不传入参数，则重置所有组件 */
  def resetFields(): Unit = js.native
  def resetFields(names: js.Array[String]): Unit = js.native
  /** 设置一组输入控件的值 */
  def setFields(obj: js.Object): Unit = js.native
  /** 设置一组输入控件的值 */
  def setFieldsValue(obj: js.Object): Unit = js.native
  def setFieldsValue(obj: js.Object, callback: js.Function): Unit = js.native
  def validateFields(): Unit = js.native
  def validateFields(callback: ValidateCallback[V]): Unit = js.native
  def validateFields(fieldNames: js.Array[String]): Unit = js.native
  def validateFields(fieldNames: js.Array[String], callback: ValidateCallback[V]): Unit = js.native
  def validateFields(fieldNames: js.Array[String], options: ValidateFieldsOptions): Unit = js.native
  /** 校验并获取一组输入域的值与 Error */
  def validateFields(fieldNames: js.Array[String], options: ValidateFieldsOptions, callback: ValidateCallback[V]): Unit = js.native
  def validateFields(options: ValidateFieldsOptions): Unit = js.native
  def validateFields(options: ValidateFieldsOptions, callback: ValidateCallback[V]): Unit = js.native
  def validateFieldsAndScroll(): Unit = js.native
  def validateFieldsAndScroll(callback: ValidateCallback[V]): Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[String]): Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[String], callback: ValidateCallback[V]): Unit = js.native
  def validateFieldsAndScroll(fieldNames: js.Array[String], options: ValidateFieldsOptions): Unit = js.native
  /** 与 `validateFields` 相似，但校验完后，如果校验不通过的菜单域不在可见范围内，则自动滚动进可见范围 */
  def validateFieldsAndScroll(fieldNames: js.Array[String], options: ValidateFieldsOptions, callback: ValidateCallback[V]): Unit = js.native
  def validateFieldsAndScroll(options: ValidateFieldsOptions): Unit = js.native
  def validateFieldsAndScroll(options: ValidateFieldsOptions, callback: ValidateCallback[V]): Unit = js.native
}

