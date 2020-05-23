package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Search")
@js.native
class Search protected ()
  extends typings.activexOutlook.Outlook.Search {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Filter: String = js.native
  /* CompleteClass */
  override val IsSynchronous: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.Search_typekey")
  override var OutlookDotSearch_typekey: typings.activexOutlook.Outlook.Search = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Results: typings.activexOutlook.Outlook.Results = js.native
  /* CompleteClass */
  override val Scope: String = js.native
  /* CompleteClass */
  override val SearchSubFolders: Boolean = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Tag: String = js.native
  /* CompleteClass */
  override def GetTable(): typings.activexOutlook.Outlook.Table = js.native
  /* CompleteClass */
  override def Save(Name: String): typings.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def Stop(): Unit = js.native
}

