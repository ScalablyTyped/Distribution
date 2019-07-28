package typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorColours extends js.Object {
  var atom: String
  var attribute: String
  var builtin: String
  var comment: String
  var cursorColor: String
  var `def`: String
  var editorBackground: String
  var keyword: String
  var leftDrawerBackground: String
  var meta: String
  var number: String
  var property: String
  var punctuation: String
  var qualifier: String
  var resultBackground: String
  var rightDrawerBackground: String
  var selection: String
  var string: String
  var string2: String
  var variable: String
  var ws: String
}

object EditorColours {
  @scala.inline
  def apply(
    atom: String,
    attribute: String,
    builtin: String,
    comment: String,
    cursorColor: String,
    `def`: String,
    editorBackground: String,
    keyword: String,
    leftDrawerBackground: String,
    meta: String,
    number: String,
    property: String,
    punctuation: String,
    qualifier: String,
    resultBackground: String,
    rightDrawerBackground: String,
    selection: String,
    string: String,
    string2: String,
    variable: String,
    ws: String
  ): EditorColours = {
    val __obj = js.Dynamic.literal(atom = atom, attribute = attribute, builtin = builtin, comment = comment, cursorColor = cursorColor, editorBackground = editorBackground, keyword = keyword, leftDrawerBackground = leftDrawerBackground, meta = meta, number = number, property = property, punctuation = punctuation, qualifier = qualifier, resultBackground = resultBackground, rightDrawerBackground = rightDrawerBackground, selection = selection, string = string, string2 = string2, variable = variable, ws = ws)
    __obj.updateDynamic("def")(`def`)
    __obj.asInstanceOf[EditorColours]
  }
}

