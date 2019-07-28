package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUploadRequest extends js.Object {
  /**
    * The upload's content type (for example, "application/octet-stream").
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  /**
    * The upload's file name. The name should not contain the '/' character. If uploading an iOS app, the file name needs to end with the .ipa extension. If uploading an Android app, the file name needs to end with the .apk extension. For all others, the file name must end with the .zip file extension.
    */
  var name: Name
  /**
    * The ARN of the project for the upload.
    */
  var projectArn: AmazonResourceName
  /**
    * The upload's upload type. Must be one of the following values:   ANDROID_APP: An Android upload.   IOS_APP: An iOS upload.   WEB_APP: A web application upload.   EXTERNAL_DATA: An external data upload.   APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.   APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.   APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.   APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.   APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.   APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.   APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.   APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.   CALABASH_TEST_PACKAGE: A Calabash test package upload.   INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.   UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.   UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.   XCTEST_TEST_PACKAGE: An Xcode test package upload.   XCTEST_UI_TEST_PACKAGE: An Xcode UI test package upload.   APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.   APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.   APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.   APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.   APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.   APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.   APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.   APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.   INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.   XCTEST_UI_TEST_SPEC: An Xcode UI test spec upload.    Note If you call CreateUpload with WEB_APP specified, AWS Device Farm throws an ArgumentException error.
    */
  var `type`: UploadType
}

object CreateUploadRequest {
  @scala.inline
  def apply(name: Name, projectArn: AmazonResourceName, `type`: UploadType, contentType: ContentType = null): CreateUploadRequest = {
    val __obj = js.Dynamic.literal(name = name, projectArn = projectArn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[CreateUploadRequest]
  }
}

