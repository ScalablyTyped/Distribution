package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indicate extends js.Object {
  /**
  					 * 该特征值是否支持 indicate 操作
  					 */
  var indicate: Boolean
  /**
  					 * 该特征值是否支持 notify 操作
  					 */
  @JSName("notify")
  var notify_FAnon_Indicate: Boolean
  /**
  					 * 该特征值是否支持 read 操作
  					 */
  var read: Boolean
  /**
  					 * 该特征值是否支持 write 操作
  					 */
  var write: Boolean
}

object Anon_Indicate {
  @scala.inline
  def apply(indicate: Boolean, notify: Boolean, read: Boolean, write: Boolean): Anon_Indicate = {
    val __obj = js.Dynamic.literal(indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Indicate]
  }
}

