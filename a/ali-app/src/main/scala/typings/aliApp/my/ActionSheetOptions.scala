package typings.aliApp.my

import typings.aliApp.AnonIndex
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需飘红选项的数组，数组内部对象字段见下表
  		 */
  var badges: js.UndefOr[js.Array[Partial[Badge]]] = js.undefined
  /**
  		 * 取消按钮文案。默认为‘取消’。注：Android平台此字段无效，不会显示取消按钮。
  		 */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /**
  		 * （iOS特殊处理）指定按钮的索引号，从0开始，使用场景：需要删除或清除数据等类似场景，默认红色
  		 */
  var destructiveBtnIndex: js.UndefOr[Double] = js.undefined
  /**
  		 * 菜单按钮文字数组
  		 */
  var items: js.Array[String]
  /**
  		 * 接口调用成功的回调函数
  		 */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ AnonIndex, Unit]] = js.undefined
  /** 菜单标题 */
  var title: js.UndefOr[String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    items: js.Array[String],
    badges: js.Array[Partial[Badge]] = null,
    cancelButtonText: String = null,
    complete: /* res */ js.Any => Unit = null,
    destructiveBtnIndex: Int | Double = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonIndex => Unit = null,
    title: String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (destructiveBtnIndex != null) __obj.updateDynamic("destructiveBtnIndex")(destructiveBtnIndex.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

