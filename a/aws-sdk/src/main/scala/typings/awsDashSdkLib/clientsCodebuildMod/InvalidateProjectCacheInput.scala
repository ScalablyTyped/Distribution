package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidateProjectCacheInput extends js.Object {
  /**
    * The name of the AWS CodeBuild build project that the cache is reset for.
    */
  var projectName: NonEmptyString
}

object InvalidateProjectCacheInput {
  @scala.inline
  def apply(projectName: NonEmptyString): InvalidateProjectCacheInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
  
    __obj.asInstanceOf[InvalidateProjectCacheInput]
  }
}

