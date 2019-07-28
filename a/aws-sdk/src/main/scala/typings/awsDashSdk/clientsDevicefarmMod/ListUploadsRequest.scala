package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The type of upload. Must be one of the following values:   ANDROID_APP: An Android upload.   IOS_APP: An iOS upload.   WEB_APP: A web application upload.   EXTERNAL_DATA: An external data upload.   APPIUM_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload.   APPIUM_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload.   APPIUM_PYTHON_TEST_PACKAGE: An Appium Python test package upload.   APPIUM_NODE_TEST_PACKAGE: An Appium Node.js test package upload.   APPIUM_RUBY_TEST_PACKAGE: An Appium Ruby test package upload.   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE: An Appium Java JUnit test package upload for a web app.   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE: An Appium Java TestNG test package upload for a web app.   APPIUM_WEB_PYTHON_TEST_PACKAGE: An Appium Python test package upload for a web app.   APPIUM_WEB_NODE_TEST_PACKAGE: An Appium Node.js test package upload for a web app.   APPIUM_WEB_RUBY_TEST_PACKAGE: An Appium Ruby test package upload for a web app.   CALABASH_TEST_PACKAGE: A Calabash test package upload.   INSTRUMENTATION_TEST_PACKAGE: An instrumentation upload.   UIAUTOMATION_TEST_PACKAGE: A uiautomation test package upload.   UIAUTOMATOR_TEST_PACKAGE: A uiautomator test package upload.   XCTEST_TEST_PACKAGE: An Xcode test package upload.   XCTEST_UI_TEST_PACKAGE: An Xcode UI test package upload.   APPIUM_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload.   APPIUM_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload.   APPIUM_PYTHON_TEST_SPEC: An Appium Python test spec upload.   APPIUM_NODE_TEST_SPEC: An Appium Node.js test spec upload.    APPIUM_RUBY_TEST_SPEC: An Appium Ruby test spec upload.   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC: An Appium Java JUnit test spec upload for a web app.   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC: An Appium Java TestNG test spec upload for a web app.   APPIUM_WEB_PYTHON_TEST_SPEC: An Appium Python test spec upload for a web app.   APPIUM_WEB_NODE_TEST_SPEC: An Appium Node.js test spec upload for a web app.   APPIUM_WEB_RUBY_TEST_SPEC: An Appium Ruby test spec upload for a web app.   INSTRUMENTATION_TEST_SPEC: An instrumentation test spec upload.   XCTEST_UI_TEST_SPEC: An Xcode UI test spec upload.  
    */
  var `type`: js.UndefOr[UploadType] = js.undefined
}

object ListUploadsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null, `type`: UploadType = null): ListUploadsRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUploadsRequest]
  }
}

