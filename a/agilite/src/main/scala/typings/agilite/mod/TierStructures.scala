package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("agilite", "TierStructures")
@js.native
class TierStructures protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  
  def deleteData(recordId: String): js.Any = js.native
  
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  
  def getTierByKey(
    tierKeys: js.Array[String],
    includeValues: Boolean,
    includeMetaData: Boolean,
    includeTierEntries: Boolean,
    sortValues: String,
    valuesOutputFormat: String
  ): js.Any = js.native
  
  var outputFormat: typings.agilite.mod.outputFormat = js.native
  
  def postData(data: js.Any): js.Any = js.native
  
  def putData(recordId: String, data: js.Any): js.Any = js.native
  
  var sort: typings.agilite.mod.sort = js.native
}
