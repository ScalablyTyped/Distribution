package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  /**
    * The upload's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The upload's category. Allowed values include:   CURATED: An upload managed by AWS Device Farm.   PRIVATE: An upload managed by the AWS Device Farm customer.  
    */
  var category: js.UndefOr[UploadCategory] = js.undefined
  /**
    * The upload's content type (for example, "application/octet-stream").
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  /**
    * When the upload was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  /**
    * A message about the upload's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
  /**
    * The upload's file name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The upload's status. Must be one of the following values:   FAILED: A failed status.   INITIALIZED: An initialized status.   PROCESSING: A processing status.   SUCCEEDED: A succeeded status.  
    */
  var status: js.UndefOr[UploadStatus] = js.undefined
  /**
    * The upload's type. Must be one of the following values:   ANDROID_APP: An Android upload.   IOS_APP: An iOS upload.   WEB_APP: A web application upload.   EXTERNAL_DATA: An external data upload.   APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.   APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.   APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.   APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.   APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for web apps.   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for web apps.   APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for web apps.   APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for web apps.   APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for web apps.   CALABASH_TEST_PACKAGE: A Calabash test package upload.   INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.   UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.   UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.   XCTEST_TEST_PACKAGE: An Xcode test package upload.   XCTEST_UI_TEST_PACKAGE: An Xcode UI test package upload.   APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.   APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.   APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.   APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.   APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.   APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.   APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.   APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.   INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.   XCTEST_UI_TEST_SPEC: An Xcode UI test spec upload.  
    */
  var `type`: js.UndefOr[UploadType] = js.undefined
  /**
    * The pre-signed Amazon S3 URL that was used to store a file through a corresponding PUT request.
    */
  var url: js.UndefOr[URL] = js.undefined
}

object Upload {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    category: UploadCategory = null,
    contentType: ContentType = null,
    created: DateTime = null,
    message: Message = null,
    metadata: Metadata = null,
    name: Name = null,
    status: UploadStatus = null,
    `type`: UploadType = null,
    url: URL = null
  ): Upload = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (created != null) __obj.updateDynamic("created")(created)
    if (message != null) __obj.updateDynamic("message")(message)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Upload]
  }
}

