package typings.angularEnvironment.angular.environment

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    * Map of domains to their environments
    */
  var domains: StringDictionary[js.Array[String]] = js.native
  
  /**
    * List of variables split by environment
    */
  var vars: StringDictionary[StringDictionary[js.Any]] = js.native
}
object Config {
  
  @scala.inline
  def apply(domains: StringDictionary[js.Array[String]], vars: StringDictionary[StringDictionary[js.Any]]): Config = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomains(value: StringDictionary[js.Array[String]]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: StringDictionary[StringDictionary[js.Any]]): Self = this.set("vars", value.asInstanceOf[js.Any])
  }
}
