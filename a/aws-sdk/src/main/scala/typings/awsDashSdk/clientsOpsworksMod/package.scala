package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.Color
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOpsworksMod {
  type AgentVersions = js.Array[AgentVersion]
  type AppAttributes = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DocumentRoot
    - typings.awsDashSdk.awsDashSdkStrings.RailsEnv
    - typings.awsDashSdk.awsDashSdkStrings.AutoBundleOnDeploy
    - typings.awsDashSdk.awsDashSdkStrings.AwsFlowRubySettings
    - java.lang.String
  */
  type AppAttributesKeys = _AppAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`aws-flow-ruby`
    - typings.awsDashSdk.awsDashSdkStrings.java
    - typings.awsDashSdk.awsDashSdkStrings.rails
    - typings.awsDashSdk.awsDashSdkStrings.php
    - typings.awsDashSdk.awsDashSdkStrings.nodejs
    - typings.awsDashSdk.awsDashSdkStrings.static
    - typings.awsDashSdk.awsDashSdkStrings.other
    - java.lang.String
  */
  type AppType = _AppType | java.lang.String
  type Apps = js.Array[App]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.x86_64
    - typings.awsDashSdk.awsDashSdkStrings.i386
    - java.lang.String
  */
  type Architecture = _Architecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.load
    - typings.awsDashSdk.awsDashSdkStrings.timer
    - java.lang.String
  */
  type AutoScalingType = _AutoScalingType | java.lang.String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ascii
    - typings.awsDashSdk.awsDashSdkStrings.big5
    - typings.awsDashSdk.awsDashSdkStrings.big5hkscs
    - typings.awsDashSdk.awsDashSdkStrings.cp037
    - typings.awsDashSdk.awsDashSdkStrings.cp424
    - typings.awsDashSdk.awsDashSdkStrings.cp437
    - typings.awsDashSdk.awsDashSdkStrings.cp500
    - typings.awsDashSdk.awsDashSdkStrings.cp720
    - typings.awsDashSdk.awsDashSdkStrings.cp737
    - typings.awsDashSdk.awsDashSdkStrings.cp775
    - typings.awsDashSdk.awsDashSdkStrings.cp850
    - typings.awsDashSdk.awsDashSdkStrings.cp852
    - typings.awsDashSdk.awsDashSdkStrings.cp855
    - typings.awsDashSdk.awsDashSdkStrings.cp856
    - typings.awsDashSdk.awsDashSdkStrings.cp857
    - typings.awsDashSdk.awsDashSdkStrings.cp858
    - typings.awsDashSdk.awsDashSdkStrings.cp860
    - typings.awsDashSdk.awsDashSdkStrings.cp861
    - typings.awsDashSdk.awsDashSdkStrings.cp862
    - typings.awsDashSdk.awsDashSdkStrings.cp863
    - typings.awsDashSdk.awsDashSdkStrings.cp864
    - typings.awsDashSdk.awsDashSdkStrings.cp865
    - typings.awsDashSdk.awsDashSdkStrings.cp866
    - typings.awsDashSdk.awsDashSdkStrings.cp869
    - typings.awsDashSdk.awsDashSdkStrings.cp874
    - typings.awsDashSdk.awsDashSdkStrings.cp875
    - typings.awsDashSdk.awsDashSdkStrings.cp932
    - typings.awsDashSdk.awsDashSdkStrings.cp949
    - typings.awsDashSdk.awsDashSdkStrings.cp950
    - typings.awsDashSdk.awsDashSdkStrings.cp1006
    - typings.awsDashSdk.awsDashSdkStrings.cp1026
    - typings.awsDashSdk.awsDashSdkStrings.cp1140
    - typings.awsDashSdk.awsDashSdkStrings.cp1250
    - typings.awsDashSdk.awsDashSdkStrings.cp1251
    - typings.awsDashSdk.awsDashSdkStrings.cp1252
    - typings.awsDashSdk.awsDashSdkStrings.cp1253
    - typings.awsDashSdk.awsDashSdkStrings.cp1254
    - typings.awsDashSdk.awsDashSdkStrings.cp1255
    - typings.awsDashSdk.awsDashSdkStrings.cp1256
    - typings.awsDashSdk.awsDashSdkStrings.cp1257
    - typings.awsDashSdk.awsDashSdkStrings.cp1258
    - typings.awsDashSdk.awsDashSdkStrings.euc_jp
    - typings.awsDashSdk.awsDashSdkStrings.euc_jis_2004
    - typings.awsDashSdk.awsDashSdkStrings.euc_jisx0213
    - typings.awsDashSdk.awsDashSdkStrings.euc_kr
    - typings.awsDashSdk.awsDashSdkStrings.gb2312
    - typings.awsDashSdk.awsDashSdkStrings.gbk
    - typings.awsDashSdk.awsDashSdkStrings.gb18030
    - typings.awsDashSdk.awsDashSdkStrings.hz
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp_1
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp_2
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp_2004
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp_3
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_jp_ext
    - typings.awsDashSdk.awsDashSdkStrings.iso2022_kr
    - typings.awsDashSdk.awsDashSdkStrings.latin_1
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_2
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_3
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_4
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_5
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_6
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_7
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_8
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_9
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_10
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_13
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_14
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_15
    - typings.awsDashSdk.awsDashSdkStrings.iso8859_16
    - typings.awsDashSdk.awsDashSdkStrings.johab
    - typings.awsDashSdk.awsDashSdkStrings.koi8_r
    - typings.awsDashSdk.awsDashSdkStrings.koi8_u
    - typings.awsDashSdk.awsDashSdkStrings.mac_cyrillic
    - typings.awsDashSdk.awsDashSdkStrings.mac_greek
    - typings.awsDashSdk.awsDashSdkStrings.mac_iceland
    - typings.awsDashSdk.awsDashSdkStrings.mac_latin2
    - typings.awsDashSdk.awsDashSdkStrings.mac_roman
    - typings.awsDashSdk.awsDashSdkStrings.mac_turkish
    - typings.awsDashSdk.awsDashSdkStrings.ptcp154
    - typings.awsDashSdk.awsDashSdkStrings.shift_jis
    - typings.awsDashSdk.awsDashSdkStrings.shift_jis_2004
    - typings.awsDashSdk.awsDashSdkStrings.shift_jisx0213
    - typings.awsDashSdk.awsDashSdkStrings.utf_32
    - typings.awsDashSdk.awsDashSdkStrings.utf_32_be
    - typings.awsDashSdk.awsDashSdkStrings.utf_32_le
    - typings.awsDashSdk.awsDashSdkStrings.utf_16
    - typings.awsDashSdk.awsDashSdkStrings.utf_16_be
    - typings.awsDashSdk.awsDashSdkStrings.utf_16_le
    - typings.awsDashSdk.awsDashSdkStrings.utf_7
    - typings.awsDashSdk.awsDashSdkStrings.utf_8
    - typings.awsDashSdk.awsDashSdkStrings.utf_8_sig
    - java.lang.String
  */
  type CloudWatchLogsEncoding = _CloudWatchLogsEncoding | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.start_of_file
    - typings.awsDashSdk.awsDashSdkStrings.end_of_file
    - java.lang.String
  */
  type CloudWatchLogsInitialPosition = _CloudWatchLogsInitialPosition | java.lang.String
  type CloudWatchLogsLogStreams = js.Array[CloudWatchLogsLogStream]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL
    - typings.awsDashSdk.awsDashSdkStrings.UTC
    - java.lang.String
  */
  type CloudWatchLogsTimeZone = _CloudWatchLogsTimeZone | java.lang.String
  type Commands = js.Array[Command]
  type DailyAutoScalingSchedule = StringDictionary[Switch]
  type DataSources = js.Array[DataSource]
  type DateTime = java.lang.String
  type DeploymentCommandArgs = StringDictionary[Strings]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.install_dependencies
    - typings.awsDashSdk.awsDashSdkStrings.update_dependencies
    - typings.awsDashSdk.awsDashSdkStrings.update_custom_cookbooks
    - typings.awsDashSdk.awsDashSdkStrings.execute_recipes
    - typings.awsDashSdk.awsDashSdkStrings.configure
    - typings.awsDashSdk.awsDashSdkStrings.setup
    - typings.awsDashSdk.awsDashSdkStrings.deploy
    - typings.awsDashSdk.awsDashSdkStrings.rollback
    - typings.awsDashSdk.awsDashSdkStrings.start
    - typings.awsDashSdk.awsDashSdkStrings.stop
    - typings.awsDashSdk.awsDashSdkStrings.restart
    - typings.awsDashSdk.awsDashSdkStrings.undeploy
    - java.lang.String
  */
  type DeploymentCommandName = _DeploymentCommandName | java.lang.String
  type Deployments = js.Array[Deployment]
  type Double = scala.Double
  type EcsClusters = js.Array[EcsCluster]
  type ElasticIps = js.Array[ElasticIp]
  type ElasticLoadBalancers = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type Hour = java.lang.String
  type Instances = js.Array[Instance]
  type Integer = scala.Double
  type LayerAttributes = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EcsClusterArn
    - typings.awsDashSdk.awsDashSdkStrings.EnableHaproxyStats
    - typings.awsDashSdk.awsDashSdkStrings.HaproxyStatsUrl
    - typings.awsDashSdk.awsDashSdkStrings.HaproxyStatsUser
    - typings.awsDashSdk.awsDashSdkStrings.HaproxyStatsPassword
    - typings.awsDashSdk.awsDashSdkStrings.HaproxyHealthCheckUrl
    - typings.awsDashSdk.awsDashSdkStrings.HaproxyHealthCheckMethod
    - typings.awsDashSdk.awsDashSdkStrings.MysqlRootPassword
    - typings.awsDashSdk.awsDashSdkStrings.MysqlRootPasswordUbiquitous
    - typings.awsDashSdk.awsDashSdkStrings.GangliaUrl
    - typings.awsDashSdk.awsDashSdkStrings.GangliaUser
    - typings.awsDashSdk.awsDashSdkStrings.GangliaPassword
    - typings.awsDashSdk.awsDashSdkStrings.MemcachedMemory
    - typings.awsDashSdk.awsDashSdkStrings.NodejsVersion
    - typings.awsDashSdk.awsDashSdkStrings.RubyVersion
    - typings.awsDashSdk.awsDashSdkStrings.RubygemsVersion
    - typings.awsDashSdk.awsDashSdkStrings.ManageBundler
    - typings.awsDashSdk.awsDashSdkStrings.BundlerVersion
    - typings.awsDashSdk.awsDashSdkStrings.RailsStack
    - typings.awsDashSdk.awsDashSdkStrings.PassengerVersion
    - typings.awsDashSdk.awsDashSdkStrings.Jvm
    - typings.awsDashSdk.awsDashSdkStrings.JvmVersion
    - typings.awsDashSdk.awsDashSdkStrings.JvmOptions
    - typings.awsDashSdk.awsDashSdkStrings.JavaAppServer
    - typings.awsDashSdk.awsDashSdkStrings.JavaAppServerVersion
    - java.lang.String
  */
  type LayerAttributesKeys = _LayerAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`aws-flow-ruby`
    - typings.awsDashSdk.awsDashSdkStrings.`ecs-cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`java-app`
    - typings.awsDashSdk.awsDashSdkStrings.lb
    - typings.awsDashSdk.awsDashSdkStrings.web
    - typings.awsDashSdk.awsDashSdkStrings.`php-app`
    - typings.awsDashSdk.awsDashSdkStrings.`rails-app`
    - typings.awsDashSdk.awsDashSdkStrings.`nodejs-app`
    - typings.awsDashSdk.awsDashSdkStrings.memcached
    - typings.awsDashSdk.awsDashSdkStrings.`db-master`
    - typings.awsDashSdk.awsDashSdkStrings.`monitoring-master`
    - typings.awsDashSdk.awsDashSdkStrings.custom
    - java.lang.String
  */
  type LayerType = _LayerType | java.lang.String
  type Layers = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations = js.Array[LoadBasedAutoScalingConfiguration]
  type MaxResults = scala.Double
  type Minute = scala.Double
  type NextToken = java.lang.String
  type OperatingSystemConfigurationManagers = js.Array[OperatingSystemConfigurationManager]
  type OperatingSystems = js.Array[OperatingSystem]
  type Parameters = StringDictionary[String]
  type Permissions = js.Array[Permission]
  type RaidArrays = js.Array[RaidArray]
  type RdsDbInstances = js.Array[RdsDbInstance]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ebs
    - typings.awsDashSdk.awsDashSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = _RootDeviceType | java.lang.String
  type ServiceErrors = js.Array[ServiceError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.git
    - typings.awsDashSdk.awsDashSdkStrings.svn
    - typings.awsDashSdk.awsDashSdkStrings.archive
    - typings.awsDashSdk.awsDashSdkStrings.s3
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type StackAttributes = StringDictionary[String]
  type StackAttributesKeys = Color | java.lang.String
  type Stacks = js.Array[Stack]
  type String = java.lang.String
  type Strings = js.Array[String]
  type Switch = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = StringDictionary[TagValue]
  type TimeBasedAutoScalingConfigurations = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles = js.Array[UserProfile]
  type ValidForInMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.paravirtual
    - typings.awsDashSdk.awsDashSdkStrings.hvm
    - java.lang.String
  */
  type VirtualizationType = _VirtualizationType | java.lang.String
  type VolumeConfigurations = js.Array[VolumeConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.gp2
    - typings.awsDashSdk.awsDashSdkStrings.io1
    - typings.awsDashSdk.awsDashSdkStrings.standard
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  type Volumes = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-02-18`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
