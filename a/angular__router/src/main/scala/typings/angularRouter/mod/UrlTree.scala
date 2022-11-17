package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "UrlTree")
@js.native
open class UrlTree () extends StObject {
  def this(/** The root segment group of the URL tree */
  root: UrlSegmentGroup) = this()
  def this(
    /** The root segment group of the URL tree */
  root: Unit,
    /** The query params of the URL */
  queryParams: Params
  ) = this()
  def this(
    /** The root segment group of the URL tree */
  root: UrlSegmentGroup,
    /** The query params of the URL */
  queryParams: Params
  ) = this()
  def this(
    /** The root segment group of the URL tree */
  root: Unit,
    /** The query params of the URL */
  queryParams: Unit,
    /** The fragment of the URL */
  fragment: String
  ) = this()
  def this(
    /** The root segment group of the URL tree */
  root: Unit,
    /** The query params of the URL */
  queryParams: Params,
    /** The fragment of the URL */
  fragment: String
  ) = this()
  def this(
    /** The root segment group of the URL tree */
  root: UrlSegmentGroup,
    /** The query params of the URL */
  queryParams: Unit,
    /** The fragment of the URL */
  fragment: String
  ) = this()
  def this(
    /** The root segment group of the URL tree */
  root: UrlSegmentGroup,
    /** The query params of the URL */
  queryParams: Params,
    /** The fragment of the URL */
  fragment: String
  ) = this()
  
  /** The fragment of the URL */
  var fragment: String | Null = js.native
  
  def queryParamMap: ParamMap = js.native
  
  /** The query params of the URL */
  var queryParams: Params = js.native
  
  /** The root segment group of the URL tree */
  var root: UrlSegmentGroup = js.native
}
