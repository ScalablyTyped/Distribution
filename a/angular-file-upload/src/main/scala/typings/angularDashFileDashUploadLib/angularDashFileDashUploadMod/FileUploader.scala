package typings
package angularDashFileDashUploadLib.angularDashFileDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploader extends FileUploaderOptions {
  /**
    * true if uploader is html5-uploader. Read only.
    */
  var isHTML5: scala.Boolean = js.native
  /**
    * true if an upload is in progress. Read only.
    */
  var isUploading: scala.Boolean = js.native
  /**
    * Upload queue progress percentage. Read only.
    */
  var progress: scala.Double = js.native
  def addToQueue(files: js.Array[js.Object], options: js.Object, filters: java.lang.String): scala.Unit = js.native
  def addToQueue(files: js.Array[js.Object], options: js.Object, filters: js.Array[Filter]): scala.Unit = js.native
  def addToQueue(files: js.Object, options: js.Object, filters: java.lang.String): scala.Unit = js.native
  def addToQueue(files: js.Object, options: js.Object, filters: js.Array[Filter]): scala.Unit = js.native
  def addToQueue(files: stdLib.FileList, options: js.Object, filters: java.lang.String): scala.Unit = js.native
  def addToQueue(files: stdLib.FileList, options: js.Object, filters: js.Array[Filter]): scala.Unit = js.native
  def addToQueue(files: stdLib.File, options: js.Object, filters: java.lang.String): scala.Unit = js.native
  // **Methods**
  /**
    * Add items to the queue
    */
  def addToQueue(files: stdLib.File, options: js.Object, filters: js.Array[Filter]): scala.Unit = js.native
  def addToQueue(files: stdLib.HTMLInputElement, options: js.Object, filters: java.lang.String): scala.Unit = js.native
  def addToQueue(files: stdLib.HTMLInputElement, options: js.Object, filters: js.Array[Filter]): scala.Unit = js.native
  /**
    * Cancels all current uploads.
    */
  def cancelAll(): scala.Unit = js.native
  /**
    * Cancels uploading of item, where value is {FileItem} or index of item.
    */
  def cancelItem(value: FileItem): scala.Unit = js.native
  def cancelItem(value: scala.Double): scala.Unit = js.native
  /**
    * Removes all elements from the queue.
    */
  def clearQueue(): scala.Unit = js.native
  /**
    * Destroys a uploader.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Returns the index of the {FileItem} queue element.
    */
  def getIndexOfItem(fileItem: FileItem): scala.Double = js.native
  /**
    * Return an array of all pending items on the queue
    */
  def getNotUploadedItems(): js.Array[FileItem] = js.native
  /**
    * Return items are ready to upload.
    */
  def getReadyItems(): js.Array[FileItem] = js.native
  /**
    * Returns true if value is {File}.
    */
  def isFile(value: js.Any): scala.Boolean = js.native
  /**
    * Returns true if value is {FileLikeObject}.
    */
  def isFileLikeObject(value: js.Any): scala.Boolean = js.native
  // **Callbacks**
  /**
    * Fires after adding all the dragged or selected files to the queue.
    */
  def onAfterAddingAll(addedItems: js.Array[FileItem]): scala.Unit = js.native
  /**
    * Fires after adding a single file to the queue.
    */
  def onAfterAddingFile(item: FileItem): scala.Unit = js.native
  /**
    * Fires before uploading an item.
    */
  def onBeforeUploadItem(item: FileItem): scala.Unit = js.native
  /**
    * On cancel uploading
    */
  def onCancelItem(item: FileItem, response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit = js.native
  /**
    * On all loaded when uploading an entire queue, or on file loaded when uploading a single independent file
    */
  def onCompleteAll(): scala.Unit = js.native
  /**
    * On file upload complete (independently of the sucess of the operation)
    */
  def onCompleteItem(item: FileItem, response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit = js.native
  /**
    * On upload error
    */
  def onErrorItem(item: FileItem, response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit = js.native
  /**
    * On upload queue progress
    */
  def onProgressAll(progress: scala.Double): scala.Unit = js.native
  /**
    * On file upload progress.
    */
  def onProgressItem(item: FileItem, progress: scala.Double): scala.Unit = js.native
  /**
    * On file successfully uploaded
    */
  def onSuccessItem(item: FileItem, response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit = js.native
  /**
    * When adding a file failed
    */
  def onWhenAddingFileFailed(item: FileItem, filter: Filter, options: js.Object): scala.Unit = js.native
  /**
    * Remove an item from the queue, where value is {FileItem} or index of item.
    */
  def removeFromQueue(value: FileItem): scala.Unit = js.native
  def removeFromQueue(value: scala.Double): scala.Unit = js.native
  /**
    * Upload all pending items on the queue.
    */
  def uploadAll(): scala.Unit = js.native
  /**
    * Uploads an item, where value is {FileItem} or index of item.
    */
  def uploadItem(value: FileItem): scala.Unit = js.native
  def uploadItem(value: scala.Double): scala.Unit = js.native
}

