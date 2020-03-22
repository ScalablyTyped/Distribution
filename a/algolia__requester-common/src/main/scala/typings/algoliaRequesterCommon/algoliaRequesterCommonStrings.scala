package typings.algoliaRequesterCommon

import typings.algoliaRequesterCommon.mod.MethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object algoliaRequesterCommonStrings {
  @js.native
  sealed trait DELETE extends MethodType
  
  @js.native
  sealed trait GET extends MethodType
  
  @js.native
  sealed trait POST extends MethodType
  
  @js.native
  sealed trait PUT extends MethodType
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
}

