package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlSegment")
@js.native
open class UrlSegment protected () extends StObject {
  def this(
    /** The path part of a URL segment */
  path: String,
    /** The matrix parameters associated with a segment */
  parameters: StringDictionary[String]
  ) = this()
  
  def parameterMap: ParamMap = js.native
  
  /** The matrix parameters associated with a segment */
  var parameters: StringDictionary[String] = js.native
  
  /** The path part of a URL segment */
  var path: String = js.native
}
