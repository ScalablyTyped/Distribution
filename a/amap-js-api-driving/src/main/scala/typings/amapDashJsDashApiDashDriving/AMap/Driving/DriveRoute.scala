package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingNumbers.`0`
import typings.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRoute extends js.Object {
  /**
    * 起点到终点的驾车距离，单位：米
    */
  var distance: Double
  /**
    * 驾车规划策略
    */
  var policy: String
  /**
    * 限行结果
    * 0 代表限行已规避或未限行，即该路线没有限行路段
    * 1 代表限行无法规避，即该线路有限行路段
    */
  var restriction: `0` | `1`
  /**
    * 子路段DriveStep集合
    */
  var steps: js.Array[DriveStep]
  /**
    * 时间预计，单位：秒
    */
  var time: Double
  /**
    * 此驾车路线收费金额，单位：元
    */
  var tolls: Double
  /**
    * 收费路段长度，单位：米
    */
  var tolls_distance: Double
}

object DriveRoute {
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    restriction: `0` | `1`,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DriveRoute]
  }
}

