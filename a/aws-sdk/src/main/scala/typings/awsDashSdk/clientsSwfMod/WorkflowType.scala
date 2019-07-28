package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowType extends js.Object {
  /**
    *  The name of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var name: Name
  /**
    *  The version of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var version: Version
}

object WorkflowType {
  @scala.inline
  def apply(name: Name, version: Version): WorkflowType = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[WorkflowType]
  }
}

