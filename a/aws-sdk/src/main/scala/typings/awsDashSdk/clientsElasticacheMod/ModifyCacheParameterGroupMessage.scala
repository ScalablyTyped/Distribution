package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to modify.
    */
  var CacheParameterGroupName: String
  /**
    * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
    */
  var ParameterNameValues: ParameterNameValueList
}

object ModifyCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String, ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName, ParameterNameValues = ParameterNameValues)
  
    __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
  }
}

